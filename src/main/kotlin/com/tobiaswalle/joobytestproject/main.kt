package com.tobiaswalle.joobytestproject

import org.jooby.Kooby
import org.jooby.apitool.ApiTool
import org.jooby.run

class SubRoute : Kooby({
    get("hello") {
        "word"
    }
})

class App : Kooby({
    use(ApiTool().swagger("/swagger"))

    get("route") {
        123
    }

    use("subroute", SubRoute())
})

fun main(args: Array<String>) {
    run(::App, *args)
}
