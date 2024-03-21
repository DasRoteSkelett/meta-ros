# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Provide CMake module with extra functionality for Python."
AUTHOR = "Shane Loretz <sloretz@openrobotics.org>"
ROS_AUTHOR = "Esteve Fernandez"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "python_cmake_module"
ROS_BPN = "python_cmake_module"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    python3-native \
"

ROS_EXEC_DEPENDS = ""

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

# matches with: https://github.com/ros2-gbp/python_cmake_module-release/archive/release/rolling/python_cmake_module/0.11.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/python_cmake_module"
SRC_URI = "git://github.com/ros2-gbp/python_cmake_module-release;${ROS_BRANCH};protocol=https"
SRCREV = "4b3025bb84aaec36488451d2d9b7c10b145e2303"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
