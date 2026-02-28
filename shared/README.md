# `:shared`

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
  subgraph :feature
    direction TB
    subgraph :feature:settings
      direction TB
      :feature:settings:impl[impl]:::cmp-feature
    end
    subgraph :feature:interests
      direction TB
      :feature:interests:api[api]:::kmp-library
      :feature:interests:impl[impl]:::cmp-feature
    end
    subgraph :feature:foryou
      direction TB
      :feature:foryou:api[api]:::kmp-library
      :feature:foryou:impl[impl]:::cmp-feature
    end
    subgraph :feature:bookmarks
      direction TB
      :feature:bookmarks:api[api]:::kmp-library
      :feature:bookmarks:impl[impl]:::cmp-feature
    end
    subgraph :feature:topic
      direction TB
      :feature:topic:api[api]:::kmp-library
      :feature:topic:impl[impl]:::cmp-feature
    end
    subgraph :feature:search
      direction TB
      :feature:search:api[api]:::kmp-library
      :feature:search:impl[impl]:::cmp-feature
    end
  end
  subgraph :sync
    direction TB
    :sync:work[work]:::kmp-library
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
  :feature:bookmarks:impl -.-> :core:data
  :feature:bookmarks:impl -.-> :core:designsystem
  :feature:bookmarks:impl -.-> :core:ui
  :feature:bookmarks:impl -.-> :feature:bookmarks:api
  :feature:foryou:impl -.-> :core:data
  :feature:foryou:impl -.-> :core:designsystem
  :feature:foryou:impl -.-> :core:domain
  :feature:foryou:impl -.-> :core:notifications
  :feature:foryou:impl -.-> :core:ui
  :feature:foryou:impl -.-> :feature:foryou:api
  :feature:interests:impl -.-> :core:data
  :feature:interests:impl -.-> :core:designsystem
  :feature:interests:impl -.-> :core:domain
  :feature:interests:impl -.-> :core:ui
  :feature:interests:impl -.-> :feature:interests:api
  :feature:search:impl -.-> :core:data
  :feature:search:impl -.-> :core:designsystem
  :feature:search:impl -.-> :core:domain
  :feature:search:impl -.-> :core:ui
  :feature:search:impl -.-> :feature:search:api
  :feature:settings:impl -.-> :core:data
  :feature:settings:impl -.-> :core:designsystem
  :feature:settings:impl -.-> :core:ui
  :feature:topic:impl -.-> :core:data
  :feature:topic:impl -.-> :core:designsystem
  :feature:topic:impl -.-> :core:ui
  :feature:topic:impl -.-> :feature:topic:api
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
  :shared --> :feature:bookmarks:api
  :shared --> :feature:bookmarks:impl
  :shared --> :feature:foryou:api
  :shared --> :feature:foryou:impl
  :shared --> :feature:interests:api
  :shared --> :feature:interests:impl
  :shared --> :feature:search:api
  :shared --> :feature:search:impl
  :shared --> :feature:settings:impl
  :shared --> :feature:topic:api
  :shared --> :feature:topic:impl
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
