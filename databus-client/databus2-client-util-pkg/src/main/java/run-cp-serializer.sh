#!/bin/bash

script_dir=`dirname $0`
source $script_dir/setup.inc

java -cp ${cp} com.linkedin.databus2.client.util.CheckpointSerializerMain $*