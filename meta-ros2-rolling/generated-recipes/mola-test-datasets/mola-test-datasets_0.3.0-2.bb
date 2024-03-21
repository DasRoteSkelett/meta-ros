# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Small SLAM dataset extracts used for demos or unit tests in the rest of MOLA packages"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://github.com/MOLAorg/"
SECTION = "devel"
LICENSE = "BSD & BSD & CC-BY-NC-SA-3.0 & CC-BY-3.0 & CC-BY-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=c1feec27682903a4270dbb401e443f91"

ROS_CN = "mola_test_datasets"
ROS_BPN = "mola_test_datasets"

ROS_BUILD_DEPENDS = " \
    ament-cmake-xmllint \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-gtest-native \
    ament-cmake-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

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

# matches with: https://github.com/ros2-gbp/mola_test_datasets-release/archive/release/rolling/mola_test_datasets/0.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/mola_test_datasets"
SRC_URI = "git://github.com/ros2-gbp/mola_test_datasets-release;${ROS_BRANCH};protocol=https"
SRCREV = "f6f67a52fc7aaf1f19fa4d733e7ee6ecfe4b8e06"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
