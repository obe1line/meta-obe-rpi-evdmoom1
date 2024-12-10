#!/bin/bash

# ensure the directory is there
mkdir -p $(dirname $0)/../kas-build

# faster clone
export KAS_CLONE_DEPTH=1
export KAS_BUILD_DIR=$(dirname $0)/../kas-build
kas build kas-poky-rpi0w.yml
