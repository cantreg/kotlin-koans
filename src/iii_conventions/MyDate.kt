package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        when {
            this.year > other.year -> return 1
            this.year < other.year -> return -1
            this.month > other.month -> return 1
            this.month < other.month -> return -1
            this.dayOfMonth > other.dayOfMonth -> return 1
            this.dayOfMonth < other.dayOfMonth -> return -1
        }
        return 0
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
