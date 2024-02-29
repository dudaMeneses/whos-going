package com.duda.whosgoing.models

class Invite (
    name: String,
    plusOne: Boolean,
    who: Set<Person>,
    status: InviteStatus,
)