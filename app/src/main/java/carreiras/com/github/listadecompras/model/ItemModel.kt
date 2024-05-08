package carreiras.com.github.listadecompras.model

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)