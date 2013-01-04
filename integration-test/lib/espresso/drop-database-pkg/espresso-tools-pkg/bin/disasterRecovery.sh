#!/bin/bash

script_dir=`dirname $0`
config_dir=$script_dir/../conf
source $script_dir/setup.inc

echo ${JAVA_HOME}/bin/java ${JVM_ARGS} -cp ${cp} com.linkedin.espresso.Disaster.DisasterRestorer $@
${JAVA_HOME}/bin/java ${JVM_ARGS} -cp ${cp} com.linkedin.espresso.Disaster.DisasterRestorer $@
