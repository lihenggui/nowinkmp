# `:feature:foryou:impl`

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
    subgraph :feature:foryou
      direction TB
      :feature:foryou:api[api]:::kmp-library
      :feature:foryou:impl[impl]:::cmp-feature
    end
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
  :feature:foryou:impl -.-> :core:data
  :feature:foryou:impl -.-> :core:designsystem
  :feature:foryou:impl -.-> :core:domain
  :feature:foryou:impl -.-> :core:notifications
  :feature:foryou:impl -.-> :core:ui
  :feature:foryou:impl -.-> :feature:foryou:api

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
