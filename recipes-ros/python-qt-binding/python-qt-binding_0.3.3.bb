DESCRIPTION = "This stack provides Python bindings for Qt. \
    There are two providers: pyside and pyqt.  PySide is released under \
    the LGPL.  PyQt is released under the GPL. \
 \
    Both the bindings and tools to build bindings are included from each \
    available provider.  For PySide, it is called "Shiboken".  For PyQt, \
    this is called 'SIP'. \
    \
    Also provided is adapter code to make the user's Python code \
    independent of which binding provider was actually used which makes \
    it very easy to switch between these."
HOMEPAGE = "http://ros.org/wiki/python_qt_binding"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbuild qtbase python-pyqt5"
RDEPENDS_${PN} += " python-pyqt5 qtbase "

SRC_URI = "https://github.com/ros-visualization/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "418269f0817eb2c8bbd884e863170414"
SRC_URI[sha256sum] = "3c83d03aa1663052daa7819fd20e15f4061cd4e37a82a71b27798f801252f8d6"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
