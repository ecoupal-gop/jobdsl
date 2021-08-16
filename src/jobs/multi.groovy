multibranchPipelineJob('example') {
    branchSources {
        git {
            id('demo')
            remote('https://github.com/ecoupal-gop/demo.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
