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
                val id = posts[i].ownerId
                val date = posts[i].date
                posts[i] = currentPost.copy()
                posts[i].ownerId = id
                posts[i].date = date
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