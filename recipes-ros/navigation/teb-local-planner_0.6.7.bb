DESCRIPTION = "The teb_local_planner package implements a plugin to the base_local_planner of the 2D navigation stack. The underlying method called Timed Elastic Band locally optimizes the robot's trajectory with respect to trajectory execution time, separation from obstacles and compliance with kinodynamic constraints at runtime."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-generation base-local-planner costmap-2d dynamic-reconfigure nav-msgs nav-core roscpp pluginlib std-msgs tf message-runtime costmap-converter interactive-markers tf-conversions pcl-conversions libg2o  libeigen suitesparse-cxsparse suitesparse-btf suitesparse-klu suitesparse-umfpack"

SRC_URI = "https://github.com/rst-tu-dortmund/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4755172ef1435822ba845f9bff86b175"
SRC_URI[sha256sum] = "29c0109e626ec98da7476f44fc56b1233b78f372d0444f5325458fbff2393418"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
