package com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.decorations

import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.ProductDecoratorKotlin
import com.example.syl.AndroidDesignPatterns.decorator_example.kotlin.ProductKotlin

class ProductImageKotlin(productKotlin: ProductKotlin) : ProductDecoratorKotlin(productKotlin) {

    override fun makeProduct(): String {
        return super.makeProduct() + " with image"
    }
}