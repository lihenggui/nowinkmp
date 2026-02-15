# `:core:datastore`

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
  subgraph :core
    direction TB
    :core:common[common]:::kmp-library
    :core:datastore[datastore]:::kmp-library
    :core:datastore-proto[datastore-proto]:::kmp-library
    :core:model[model]:::kmp-library
  end

  :core:datastore -.-> :core:common
  :core:datastore -.-> :core:datastore-proto
  :core:datastore -.-> :core:model

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
