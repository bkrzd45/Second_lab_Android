package ru.stankin.labs.bekmurzaev2

/**
 * Модель контакта
 */
data class productItem(
    val name: String,
    val price: Double,
    val description: String,
    val rating: Double
)
/**
 * Функция для создания списка контактов.
 */
fun products(): List<productItem> {
    return listOf(
        productItem(
            name = "Smartphone",
            price = 499.99,
            description = "High-end smartphone with advanced features",
            rating = 4.5
        ),
        productItem(
            name = "Laptop",
            price = 999.99,
            description = "Powerful laptop for gaming and productivity",
            rating = 4.8
        ),
        productItem(
            name = "Smart Watch",
            price = 199.99,
            description = "Fitness tracker with heart rate monitoring",
            rating = 4.2
        ),
        productItem(
            name = "Wireless Headphones",
            price = 149.99,
            description = "Noise-cancelling headphones for immersive audio experience",
            rating = 4.7
        ),
        productItem(
            name = "Tablet",
            price = 349.99,
            description = "Versatile tablet for work and entertainment",
            rating = 4.4
        ),
        productItem(
            name = "Gaming Console",
            price = 399.99,
            description = "Next-generation gaming console for immersive gaming experience",
            rating = 4.9
        ),
        productItem(
            name = "4K Smart TV",
            price = 799.99,
            description = "Ultra-high-definition smart TV with streaming capabilities",
            rating = 4.6
        ),
        productItem(
            name = "Digital Camera",
            price = 599.99,
            description = "Professional-grade digital camera for capturing stunning photos",
            rating = 4.3
        ),
        productItem(
            name = "Wireless Router",
            price = 129.99,
            description = "High-speed wireless router for seamless internet connectivity",
            rating = 4.7
        ),
        productItem(
            name = "External Hard Drive",
            price = 89.99,
            description = "Large-capacity external hard drive for data storage and backup",
            rating = 4.5
        ),
        productItem(
            name = "Fitness Tracker",
            price = 79.99,
            description = "Activity tracker for monitoring fitness and health metrics",
            rating = 4.1
        ),
        productItem(
            name = "Bluetooth Speaker",
            price = 59.99,
            description = "Portable Bluetooth speaker for wireless audio streaming",
            rating = 4.4
        ),
        productItem(
            name = "Home Security Camera",
            price = 149.99,
            description = "Smart home security camera with motion detection",
            rating = 4.6
        ),
        productItem(
            name = "Electric Toothbrush",
            price = 49.99,
            description = "Smart electric toothbrush with multiple brushing modes",
            rating = 4.3
        ),
        productItem(
            name = "Robot Vacuum Cleaner",
            price = 299.99,
            description = "Smart robot vacuum cleaner for automated cleaning",
            rating = 4.8
        ),
        productItem(
            name = "Air Purifier",
            price = 199.99,
            description = "HEPA air purifier for clean and fresh indoor air",
            rating = 4.5
        ),
        productItem(
            name = "Wireless Earbuds",
            price = 129.99,
            description = "True wireless earbuds for on-the-go audio",
            rating = 4.2
        ),
        productItem(
            name = "Smart Thermostat",
            price = 149.99,
            description = "Wi-Fi enabled smart thermostat for energy savings",
            rating = 4.7
        ),
        productItem(
            name = "Coffee Maker",
            price = 79.99,
            description = "Programmable coffee maker for brewing your favorite coffee",
            rating = 4.4
        ),
        productItem(
            name = "Multifunction Printer",
            price = 199.99,
            description = "All-in-one printer for printing, scanning, and copying",
            rating = 4.6
        )
    )
}
