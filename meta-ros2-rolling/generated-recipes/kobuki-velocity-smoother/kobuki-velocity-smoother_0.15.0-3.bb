# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Bound incoming velocity messages according to robot velocity and acceleration limits."
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jorge Santos Simon"
HOMEPAGE = "https://index.ros.org/p/kobuki_velocity_smoother/github-kobuki-base-velocity_smoother/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_velocity_smoother"
ROS_BPN = "kobuki_velocity_smoother"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    geometry-msgs \
    nav-msgs \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-lint-cmake \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
    ament-lint-auto \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
    python3-matplotlib \
    ros2test \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/kobuki_velocity_smoother-release/archive/release/rolling/kobuki_velocity_smoother/0.15.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/kobuki_velocity_smoother"
SRC_URI = "git://github.com/ros2-gbp/kobuki_velocity_smoother-release;${ROS_BRANCH};protocol=https"
SRCREV = "0971328fbfb8a822f3ec27da39218c6ec71f4803"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
