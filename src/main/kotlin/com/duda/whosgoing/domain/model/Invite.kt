package com.duda.whosgoing.domain.model

data class Invite (
    val name: String,
    val plusOne: Boolean,
    val who: Person,
    val status: InviteStatus = InviteStatus.NOT_ANSWERED,
)