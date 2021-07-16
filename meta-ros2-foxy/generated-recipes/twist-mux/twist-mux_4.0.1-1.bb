# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Twist multiplexer, which multiplex several velocity commands (topics) and       allows to priorize or disable them (locks)."
AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
ROS_AUTHOR = "Brighten Lee <shlee@gaitech.co.kr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "CC BY-NC-SA 4.0"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=6bc0e2b80b41b84c8240cea714dea709"

ROS_CN = "twist_mux"
ROS_BPN = "twist_mux"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    rclcpp \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    rclcpp \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    rclcpp \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-xmllint \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/twist_mux-release/archive/release/foxy/twist_mux/4.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/twist_mux"
SRC_URI = "git://github.com/ros-gbp/twist_mux-release;${ROS_BRANCH};protocol=https"
SRCREV = "c12158bffcf12b703da4159ed84e6edcf69d4c5d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}