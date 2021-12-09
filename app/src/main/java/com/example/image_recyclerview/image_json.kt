package com.example.image_recyclerview

data class image_json(
    val results: List<Result>,
    val total: Int,
    val total_pages: Int
)