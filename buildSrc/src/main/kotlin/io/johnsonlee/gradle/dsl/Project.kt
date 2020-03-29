package io.johnsonlee.gradle.dsl

import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.plugins.signing.SigningExtension

fun Project.signing(conf: SigningExtension.() -> Unit) = (this as ExtensionAware).extensions.configure("signing", conf)
