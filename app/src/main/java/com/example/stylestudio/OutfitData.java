package com.example.stylestudio;

/**
 * بيانات الأزياء: مصفوفة الصور وأسماء الأنماط (+ الأسعار والأوصاف لباقي الخطوات).
 * نفس الرقم (index) يشير إلى نفس الزي في كل المصفوفات.
 */
public final class OutfitData {

    private OutfitData() { }

    // مصفوفة الصور (8 صور)
    public static final int[] IMAGES = {
            R.drawable.outfit_hoodie,
            R.drawable.outfit_sneakers,
            R.drawable.outfit_suit,
            R.drawable.outfit_dress,
            R.drawable.outfit_tshirt,
            R.drawable.outfit_jeans,
            R.drawable.outfit_jersey,
            R.drawable.outfit_shirt
    };

    // أسماء الأنماط
    public static final String[] STYLES = {
            "Casual", "Sport", "Formal", "Party",
            "Casual", "Casual", "Sport", "Formal"
    };

    // الأسعار بالريال (للخطوتين 6 و 7)
    public static final int[] PRICES = {
            120, 250, 650, 480, 60, 150, 90, 180
    };

    // الوصف المختصر (للخطوة 6)
    public static final String[] DESCRIPTIONS = {
            "Comfortable and simple, great for daily use.",
            "Light and comfy, perfect for running and workouts.",
            "Elegant suit for meetings and interviews.",
            "Elegant dress for parties and special occasions.",
            "Light cotton tee for everyday outings.",
            "Practical jeans that match almost everything.",
            "Breathable jersey for training.",
            "Smart shirt for work and the office."
    };
}
