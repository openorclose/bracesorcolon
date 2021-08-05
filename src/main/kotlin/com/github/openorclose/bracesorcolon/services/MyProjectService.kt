package com.github.openorclose.bracesorcolon.services

import com.github.openorclose.bracesorcolon.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
