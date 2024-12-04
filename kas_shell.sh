#!/bin/bash

export KAS_BUILD_DIR=$(dirname $0)/../kas-build
kas shell kas-poky-rpi0w.yml
