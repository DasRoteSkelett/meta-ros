# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Library containing abstract CANopen driver class for ros2_canopen"
AUTHOR = "Christoph Hellmann Santos <christoph.hellmann.santos@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "ros2_canopen"
ROS_BPN = "canopen_base_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    canopen-core \
    canopen-interfaces \
    diagnostic-updater \
    lely-core-libraries \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    canopen-core \
    canopen-interfaces \
    diagnostic-updater \
    lely-core-libraries \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    canopen-core \
    canopen-interfaces \
    diagnostic-updater \
    lely-core-libraries \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_canopen-release/archive/release/rolling/canopen_base_driver/0.2.8-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/canopen_base_driver"
SRC_URI = "git://github.com/ros2-gbp/ros2_canopen-release;${ROS_BRANCH};protocol=https"
SRCREV = "e4e0a47cf93234a2871f0c724be3070a5875a975"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
