# Copyright (c) 2020 LG Electronics, Inc.

LICENSE = "BSD-3-Clause"

# Without the target dependencies, ament finds the native packages and then fails to link (error: incompatible target).
ROS_BUILD_DEPENDS += " \
    rosidl-default-runtime \
"
