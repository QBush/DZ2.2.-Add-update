package ru.netology

object WallServise {
    private var posts = emptyArray<Post>()
    private var currentID = 0

    fun add(post: Post): Post {
        currentID++
        val post = post.copy(id = currentID)
        posts += post
        return posts.last()
    }

    fun update(currentPost: Post): Boolean {
        for (i in 1..posts.size) {
            if (posts[i].id == currentPost.id) {
                posts[i] = currentPost.copy(id = posts[i].ownerId, date = posts[i].date)
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray<Post>()
        currentID = 0
    }
}