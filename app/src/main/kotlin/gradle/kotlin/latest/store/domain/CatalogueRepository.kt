package gradle.kotlin.latest.store.domain

interface CatalogueRepository {
    fun find(productId: ProductId)

}
