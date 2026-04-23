package com.homeretreat.planner.data.model

data class Precept(
    val number: Int,
    val pali: String,
    val english: String,
    val explanation: String,
    val practicalNote: String
)

val allPrecepts = listOf(
    Precept(
        number = 1,
        pali = "Panatipata veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from taking the life of any living creature.",
        explanation = "This precept extends beyond human life to include all sentient beings. It is a commitment to non-harm (ahimsa) in thought, word, and deed.",
        practicalNote = "During retreat, be mindful of insects. Gently guide them outside rather than killing them."
    ),
    Precept(
        number = 2,
        pali = "Adinnadana veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from taking that which is not given.",
        explanation = "This encompasses stealing, fraud, and taking things without explicit permission. It cultivates contentment with what one has.",
        practicalNote = "If staying with others, ask before using shared items even if you normally would not."
    ),
    Precept(
        number = 3,
        pali = "Abrahmacariya veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from any sexual activity.",
        explanation = "For lay practitioners on retreat, this means complete celibacy including abstaining from sexual thoughts and self-gratification.",
        practicalNote = "Avoid media or thoughts that arouse sensual desire. If images arise in meditation, note them and return to the breath."
    ),
    Precept(
        number = 4,
        pali = "Musavada veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from false speech, harsh speech, idle chatter, and divisive speech.",
        explanation = "Noble Silence means refraining from all unnecessary speech. This includes reading, writing, and digital communication.",
        practicalNote = "Turn off your phone or enable airplane mode. Inform family you will be in silence until a specific date."
    ),
    Precept(
        number = 5,
        pali = "Suramerayamajja pamadatthana veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from consuming intoxicating drinks and drugs causing heedlessness.",
        explanation = "All mind-altering substances are avoided including alcohol, recreational drugs, and even excessive caffeine.",
        practicalNote = "Check medications. If a prescribed medicine contains alcohol, continue taking it with mindful awareness."
    ),
    Precept(
        number = 6,
        pali = "Vikalabhojana veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from eating at improper times (after midday).",
        explanation = "For the duration of the retreat, one takes only two meals — breakfast and the main meal before noon. This develops restraint and energy for practice.",
        practicalNote = "Prepare simple food the night before. Set an alarm for 11:30 AM as a gentle reminder."
    ),
    Precept(
        number = 7,
        pali = "Nacca-gita-vadita-visukkadassana veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from dancing, singing, music, and unseemly shows.",
        explanation = "This precept guards the sense doors. Entertainment distracts from inward turning. Silence and simplicity support samadhi.",
        practicalNote = "No music, podcasts, or videos during retreat. Dhamma talks are the only exception and should be listened to mindfully."
    ),
    Precept(
        number = 8,
        pali = "Mala-gandha-vilepana-dharana-mandana-vibhusanatthana veramani sikkhapadam samadiyami",
        english = "I undertake the precept to refrain from wearing garlands, using perfumes, and beautifying the body with cosmetics.",
        explanation = "This renounces vanity and personal adornment. One practices simplicity in appearance as an outer reflection of inner letting go.",
        practicalNote = "Wear simple, comfortable clothing. Skip jewelry, makeup, and scented products."
    )
)