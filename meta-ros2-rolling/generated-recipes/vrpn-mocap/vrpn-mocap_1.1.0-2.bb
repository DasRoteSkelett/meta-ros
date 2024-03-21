# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ROS2 <a href="https://github.com/vrpn/vrpn">VRPN</a>     client built primarily to interface with motion     capture devices such as VICON and OptiTrack. A detailed list of     supported hardware can be found     <a href="https://github.com/vrpn/vrpn/wiki/Available-hardware-devices">here</a>."
AUTHOR = "Alvin Sun <alvinsunyixiao@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "vrpn_mocap"
ROS_BPN = "vrpn_mocap"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    rclcpp \
    std-msgs \
    tf2 \
    vrpn \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    std-msgs \
    tf2 \
    vrpn \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rclcpp \
    std-msgs \
    tf2 \
    vrpn \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/vrpn_mocap-release/archive/release/rolling/vrpn_mocap/1.1.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/vrpn_mocap"
SRC_URI = "git://github.com/ros2-gbp/vrpn_mocap-release;${ROS_BRANCH};protocol=https"
SRCREV = "46f6d74ee4de208f55166c520dfaad107d1f0605"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
