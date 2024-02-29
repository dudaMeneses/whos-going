package com.duda.whosgoing.models
import java.time.LocalDateTime

class Event (

    title: String,
    address: String,
    waw: LocalDateTime,
    invites: Set<Invite>

)