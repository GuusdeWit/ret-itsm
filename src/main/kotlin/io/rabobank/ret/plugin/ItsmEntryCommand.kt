package io.rabobank.ret.plugin

import io.quarkus.picocli.runtime.annotations.TopCommand
import io.quarkus.runtime.annotations.RegisterForReflection
import io.rabobank.ret.RetContext
import io.rabobank.ret.commands.PluginConfigureCommand
import io.rabobank.ret.commands.PluginInitializeCommand
import picocli.CommandLine.Command

@TopCommand
@Command(
    name = "itsm",
    description = ["Interact with itsm"],
    subcommands = [
        PluginInitializeCommand::class,
        PluginConfigureCommand::class,
    ],
)
@RegisterForReflection(targets = [RetContext::class])
class ItsmEntryCommand : Runnable {

    override fun run() {
        TODO("Not yet implemented")
    }
}
