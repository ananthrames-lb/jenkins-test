def call() {
    map = [:]

    map.command = [ name: 'command', choices: ['filesync', 'listNodes', 'hotSync', 'uninstall', 'install'], description: 'The operation to perform.\nListNodes - only shows what nodes will be deployed, but does not deploy\nhotSync - hotsyncs the nodes.' ]
return map
}
