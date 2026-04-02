# SpaceShooter - Android App

Aplicación Android desarrollada en Kotlin que implementa una interfaz inspirada en Dribbble, con listas de **Buckets** y **Shots** usando RecyclerView y Material Design Components.

## Caracteristicas

- Lista horizontal de **Buckets** con categorias de diseño
- Grid de **Shots** con iconos e imagenes
- Navegacion entre actividades al seleccionar un Bucket
- Implementacion con **RecyclerView** (LinearLayoutManager y GridLayoutManager)

## Tecnologias

- **Lenguaje:** Kotlin
- **Min SDK:** Android
- **Arquitectura:** Activity + Adapters + Models
- **UI:** RecyclerView, Material Design Components

## Estructura del proyecto

```
app/src/main/java/com/cbernals/practicemdc1/
├── MainActivity.kt
├── BucketActivity.kt
├── adapters/
│   ├── BucketAdapter.kt
│   └── ShotAdapter.kt
├── models/
│   ├── Bucket.kt
│   └── Shot.kt
└── utils/
    ├── Helper.kt
    ├── OnClickListener.kt
    └── Utils.kt
```

## Como ejecutar

1. Clona el repositorio
2. Abre el proyecto en **Android Studio**
3. Sincroniza Gradle
4. Ejecuta en un emulador o dispositivo fisico
