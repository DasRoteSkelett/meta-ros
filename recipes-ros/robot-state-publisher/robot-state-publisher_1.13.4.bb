DESCRIPTION = "This package allows you to publish the state of a robot to tf."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl controller-manager-msgs"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6117c3bbde1a7cb3c9b674b34d30dad2"
SRC_URI[sha256sum] = "d84b0457a085f23a76b7eb103df5196a70d34623a844e7f380a0301d7f850e27"

SRC_URI += "file://0001-make-rostest-in-CMakeLists-optional-ros-rosdistro-30.patch"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
