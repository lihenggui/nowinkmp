# Repackage classes into the default package to reduce the size of descriptors.
-repackageclasses

# Keep DataStore protobuf fields.
-keepclassmembers class * extends com.google.protobuf.GeneratedMessageLite* {
   <fields>;
}
