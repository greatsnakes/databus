// If a new directory is added, that contains a test inside, please add the directory here
modules = [
'databus-bootstrap-client',
'databus-bootstrap-common',
'databus-bootstrap-producer',
'databus-bootstrap-server',
'databus-bootstrap-utils',
'databus-client',
'databus-core',
'databus-events',
'databus-group-leader',
'databus-profile-client',
'databus-profile-relay',
'databus-relay',
'databus-util-cmdline',
'databus2-bootstrap',
'databus2-client',
'databus2-examples',
'databus2-relay',
'databus3-relay',
'databus2-tools',
'central-config-repo',
'database'
]

//TODO modules removed due to problems with their build dependencies:
//
// these are being worked on

nonReleaseModules = [
//  'databus-bootstrap-server-test'
//  'databus-profile-client-test'
]

modules.each { module ->
  file(module).eachDir { submodule ->
    if (!submodule.name.startsWith('.') && !nonReleaseModules.contains(submodule.name)) {
      include "${module}:${submodule.name}"
    }
  }
}