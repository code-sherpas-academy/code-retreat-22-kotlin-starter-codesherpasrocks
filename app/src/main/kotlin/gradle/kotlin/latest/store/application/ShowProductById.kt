package gradle.kotlin.latest.store.application

import gradle.kotlin.latest.store.domain.CatalogueRepository
import gradle.kotlin.latest.store.domain.Product
import gradle.kotlin.latest.store.domain.ProductDetail
import gradle.kotlin.latest.store.domain.ProductId

class ShowProductById {
    private val catalogueRepository: CatalogueRepository
    private val catalogueCache: CatalogueCache

    fun execute(productId: Long): Product {

        var product = catalogueCache.find(ProductId(productId.toUUID()))

        if (product == null) {
           product = catalogueRepository.find(ProductId(productId.toUUID()))
        }

        return product
    }
}