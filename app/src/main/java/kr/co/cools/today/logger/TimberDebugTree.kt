package kr.co.cools.today.logger

import timber.log.Timber

class TimberDebugTree: Timber.DebugTree() {

    var prefix = "[DoToday] "

    /**
     * add lineNumber
     */
    override fun createStackElementTag(element: StackTraceElement): String? {
        return super.createStackElementTag(element).plus("(").plus(element.lineNumber).plus(")")
    }

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        super.log(priority, tag, prefix.plus(message), t)
    }

}