# `:benchmarks`

## Module dependency graph

<!--region graph-->
```mermaid
---
config:
  layout: elk
  elk:
    nodePlacementStrategy: SIMPLE
---
graph TB
  subgraph :sync
    direction TB
    :sync:work[work]:::kmp-library
  end
  subgraph :feature
    direction TB
    :feature:bookmarks[bookmarks]:::cmp-feature
    :feature:foryou[foryou]:::cmp-feature
    :feature:interests[interests]:::cmp-feature
    :feature:search[search]:::cmp-feature
    :feature:settings[settings]:::cmp-feature
    :feature:topic[topic]:::cmp-feature
  end
  subgraph :core
    direction TB
    :core:analytics[analytics]:::kmp-library
    :core:common[common]:::kmp-library
    :core:data[data]:::kmp-library
    :core:database[database]:::kmp-library
    :core:datastore[datastore]:::kmp-library
    :core:datastore-proto[datastore-proto]:::kmp-library
    :core:designsystem[designsystem]:::kmp-library
    :core:domain[domain]:::kmp-library
    :core:model[model]:::kmp-library
    :core:network[network]:::kmp-library
    :core:notifications[notifications]:::kmp-library
    :core:ui[ui]:::kmp-library
  end
  :shared[shared]:::cmp-feature
  :benchmarks[benchmarks]:::android-test
  :app[app]:::cmp-application

  :app -.-> :core:designsystem
  :app -.-> :core:ui
  :app -.-> :shared
  :benchmarks -.->|testedApks| :app
  :core:data -.-> :core:analytics
  :core:data --> :core:common
  :core:data --> :core:database
  :core:data --> :core:datastore
  :core:data --> :core:network
  :core:data -.-> :core:notifications
  :core:database -.-> :core:common
  :core:database --> :core:model
  :core:datastore -.-> :core:common
  :core:datastore -.-> :core:datastore-proto
  :core:datastore -.-> :core:model
  :core:domain --> :core:data
  :core:domain --> :core:model
  :core:network --> :core:common
  :core:network --> :core:model
  :core:notifications -.-> :core:common
  :core:notifications --> :core:model
  :core:ui --> :core:analytics
  :core:ui --> :core:designsystem
  :core:ui --> :core:model
  :feature:bookmarks -.-> :core:data
  :feature:bookmarks -.-> :core:designsystem
  :feature:bookmarks -.-> :core:ui
  :feature:foryou -.-> :core:data
  :feature:foryou -.-> :core:designsystem
  :feature:foryou -.-> :core:domain
  :feature:foryou -.-> :core:notifications
  :feature:foryou -.-> :core:ui
  :feature:interests -.-> :core:data
  :feature:interests -.-> :core:designsystem
  :feature:interests -.-> :core:domain
  :feature:interests -.-> :core:ui
  :feature:search -.-> :core:data
  :feature:search -.-> :core:designsystem
  :feature:search -.-> :core:domain
  :feature:search -.-> :core:ui
  :feature:settings -.-> :core:data
  :feature:settings -.-> :core:designsystem
  :feature:settings -.-> :core:ui
  :feature:topic -.-> :core:data
  :feature:topic -.-> :core:designsystem
  :feature:topic -.-> :core:ui
  :shared --> :core:analytics
  :shared --> :core:common
  :shared --> :core:data
  :shared --> :core:designsystem
  :shared -.-> :core:designsystem
  :shared --> :core:domain
  :shared --> :core:model
  :shared --> :core:notifications
  :shared --> :core:ui
  :shared -.-> :core:ui
  :shared --> :feature:bookmarks
  :shared --> :feature:foryou
  :shared --> :feature:interests
  :shared --> :feature:search
  :shared --> :feature:settings
  :shared --> :feature:topic
  :shared --> :sync:work
  :sync:work -.-> :core:analytics
  :sync:work -.-> :core:data
  :sync:work -.-> :core:notifications

classDef cmp-application fill:#CAFFBF,stroke:#000,stroke-width:2px,color:#000;
classDef cmp-feature fill:#FFD6A5,stroke:#000,stroke-width:2px,color:#000;
classDef kmp-library fill:#9BF6FF,stroke:#000,stroke-width:2px,color:#000;
classDef jvm-library fill:#BDB2FF,stroke:#000,stroke-width:2px,color:#000;
classDef android-test fill:#A0C4FF,stroke:#000,stroke-width:2px,color:#000;
classDef unknown fill:#FFADAD,stroke:#000,stroke-width:2px,color:#000;
```

<details><summary>Graph legend</summary>

```mermaid
graph TB
  application[application]:::cmp-application
  feature[feature]:::cmp-feature
  library[library]:::kmp-library
  jvm[jvm]:::jvm-library

  application -.-> feature
  library --> jvm

classDef cmp-application fill:#CAFFBF,stroke:#000,stroke-width:2px,color:#000;
classDef cmp-feature fill:#FFD6A5,stroke:#000,stroke-width:2px,color:#000;
classDef kmp-library fill:#9BF6FF,stroke:#000,stroke-width:2px,color:#000;
classDef jvm-library fill:#BDB2FF,stroke:#000,stroke-width:2px,color:#000;
classDef android-test fill:#A0C4FF,stroke:#000,stroke-width:2px,color:#000;
classDef unknown fill:#FFADAD,stroke:#000,stroke-width:2px,color:#000;
```

</details>
<!--endregion-->
