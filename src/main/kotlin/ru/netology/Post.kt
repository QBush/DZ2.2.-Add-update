package ru.netology

data class Post(
    val id: Int = 0,
    var ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    var date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: String, //Comments,
    val copyright: String, //Copyright,
    val likes: String, //Likes,
    val reposts: String, //Reposts,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: String, //Donut,
    val postponedId: String

) {

}