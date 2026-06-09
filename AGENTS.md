# AGENTS.md

This file provides guidance to AI coding agents when working with code in this repository.

## Project Overview

Now in Android (KMP edition) — a Kotlin Multiplatform fork of Google's Now in Android reference app. Targets Android, iOS, Desktop (JVM), macOS, and experimental Web (WASM). Uses Compose Multiplatform for shared UI.

## Build Commands

```bash
# Format code (must pass before merge)
./gradlew spotlessApply
./gradlew spotlessCheck

# Build
./gradlew :app-android:assemble              # Android app (all variants)
./gradlew :app-nia-catalog-android:assemble  # Android design system catalog app
./gradlew :app:compileKotlinJvm              # shared main app desktop/JVM target
./gradlew :app-nia-catalog:compileKotlinDesktop # shared catalog desktop target

# Run desktop app
# Gradle run config task: desktopRun -DmainClass=MainKt --quiet

# Unit tests
./gradlew testDebugUnitTest testAndroidHostTest # all Android host tests
./gradlew :feature:foryou:impl:testAndroidHostTest # single module host test
./gradlew :lint:test                         # lint rule tests

# Instrumented tests (requires a connected Android emulator)
./gradlew connectedDebugAndroidTest

# Screenshot tests (Roborazzi — CI only, do NOT run locally)
# CI records/verifies screenshots and auto-commits updates via PR
# ./gradlew verifyRoborazziAndroidHostTest # verify baselines (CI only)
# ./gradlew recordRoborazziAndroidHostTest # record baselines (CI only)

# Lint
./gradlew :app-android:lintRelease :app-nia-catalog-android:lintRelease :lint:lint

# Dependency guard
./gradlew dependencyGuard                    # check
./gradlew dependencyGuardBaseline            # update baseline

# Build-logic check
./gradlew :build-logic:convention:check

# Module graphs
./gradlew graphUpdate                        # update README.md module graphs

# Badging check
./gradlew :app-android:checkReleaseBadging
```

## Architecture

**Three-layer architecture** with unidirectional data flow (UDF):
- **UI Layer** (`feature:*`) — Compose screens + ViewModels. Each feature module is independent; no inter-feature dependencies.
- **Domain Layer** (`core:domain`) — Use cases combining data from multiple repositories.
- **Data Layer** (`core:data`, `core:database`, `core:datastore`, `core:network`) — Offline-first repositories backed by SQLDelight + Proto DataStore, synced via Ktor/Ktrofit.

### Module Structure

- **`app`** — Main shared Compose Multiplatform application with app-level navigation (NiaNavHost, TopLevelDestination).
- **`app-android`** — Android application host for the shared `app` module.
- **`app-nia-catalog`** — Shared standalone design system showcase. Fully multiplatform including WASM.
- **`app-nia-catalog-android`** — Android application host for the shared catalog module.
- **`feature:*`** — Feature modules (foryou, interests, bookmarks, topic, search, settings). Depend only on `core:*` modules.
- **`core:*`** — Shared libraries. Key ones: `designsystem` (Material 3 components), `ui` (reusable composables), `model` (data types), `data` (repositories), `database` (SQLDelight), `network` (Ktor), `datastore` (Proto DataStore).
- **`shared`** — Aggregates features and core for the main app.
- **`sync:work`** — WorkManager-based sync (Android-only).
- **`build-logic/convention`** — Custom Gradle convention plugins.

### Convention Plugins

All modules use convention plugins from `build-logic/convention/` (plugin IDs prefixed `nowinandroid.*`):
- `nowinandroid.kmp.library` — KMP library: configures Android-KMP library + KMP targets (JVM, Android, iOS, macOS) + common test deps
- `nowinandroid.android.application` — Android app host using AGP 9 built-in Kotlin support
- `nowinandroid.cmp.application` — Compose Multiplatform app (Android, Desktop, iOS, macOS)
- `nowinandroid.cmp.feature` — Feature module (inherits kmp.library + adds Compose, Koin, core:ui, core:designsystem)
- `nowinandroid.di.koin` — Koin DI dependencies
- `nowinandroid.sqldelight` — SQLDelight database
- `nowinandroid.kmp.inject` — kotlin-inject DI via KSP

### Key Technology Choices

- **DI:** Koin (primary, KMP-friendly service locator) + kotlin-inject (compile-time alternative)
- **Database:** SQLDelight (multiplatform)
- **Preferences:** Proto DataStore
- **Networking:** Ktor client via Ktrofit
- **Image loading:** Coil 3
- **Serialization:** kotlinx-serialization
- **Testing:** No mocking libraries — use test doubles. Roborazzi for screenshot tests (CI only), Turbine for Flow testing.

### Build Variants

Two build types: `debug` and `release`. No flavor dimensions (demo/prod flavors were removed during KMP migration).

### KMP Source Set Layout

Modules use Kotlin Multiplatform default hierarchy: `commonMain`/`commonTest`, `androidMain`, `androidHostTest`, `androidDeviceTest`, `jvmMain`/`jvmTest`, `iosMain`, `macosMain`, etc. Android resource prefixes are auto-derived from module path (e.g., `core_model_`).

## Requirements

- JDK 17+
- Gradle uses 4GB heap (`-Xmx4g`)
- Configuration cache and parallel builds enabled
