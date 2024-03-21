# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Gazebo simulation package for the TurtleBot3"
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://turtlebot3.robotis.com"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3_simulations"
ROS_BPN = "turtlebot3_gazebo"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo-ros-pkgs} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo-ros-pkgs} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo-ros-pkgs} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/turtlebot3_simulations-release/archive/release/rolling/turtlebot3_gazebo/2.2.5-4.tar.gz
ROS_BRANCH ?= "branch=release/rolling/turtlebot3_gazebo"
SRC_URI = "git://github.com/ros2-gbp/turtlebot3_simulations-release;${ROS_BRANCH};protocol=https"
SRCREV = "434656b1bec803b2902412c911eec878dd666ac6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
