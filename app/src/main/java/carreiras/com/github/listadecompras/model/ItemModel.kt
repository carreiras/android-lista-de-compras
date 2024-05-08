package carreiras.com.github.listadecompras.model

data class ItemModel(
    val id: Int,
    val name: String,
    val onRemove: (ItemModel) -> Unit
)