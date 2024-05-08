package carreiras.com.github.listadecompras.viewmodel

import androidx.lifecycle.ViewModel
import carreiras.com.github.listadecompras.model.ItemModel

class ItemsViewModel : ViewModel() {

    private var items = mutableListOf<ItemModel>()

    fun addItem(name: String) {
        val item = ItemModel(name = name, onRemove = ::removeItem)
        items.add(item)
    }

    private fun removeItem(item: ItemModel) {
        items.remove(item)
    }
}