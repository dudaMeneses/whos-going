package com.duda.whosgoing.domain.model
import java.time.LocalDateTime

data class Event (

    val title: String,
    val address: String,
    val waw: LocalDateTime,
    val invites: Set<Invite>

)