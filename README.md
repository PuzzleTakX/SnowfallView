# PTX SnowfallView Library for B4A

PTX SnowfallView is a graphical library for creating a snowfall effect in B4A applications. It provides various customization options to enhance the visual experience.

## Getting Started

1. Initialize the PTX SnowfallView in your B4A code.
    ```vb
    Dim pta As PTX_SnowfallView
    pta.Initialize("")
    ```

2. Add the view to your activity.
    ```vb
    Activity.AddView(pta, 0%x, 0%x, 100%x, 100%y)
    ```

3. Customize the snowfall options.
    ```vb
    pta.Color = Colors.Black
    pta.EnableAlphaFade = True
    pta.EnableRandomCurving = True
    pta.AnimateDuration = 10000
    pta.GenerateSnowTiming = 45
    pta.ImageBitmap = LoadBitmap(File.DirAssets, "snow.png")
    pta.setRandomSnowSizeRange(25, 1)
    pta.setCurvingRandom(180, 90)
    pta.init
    pta.startSnowing
    ```

4. ...

## Options

### Color
Set the color of the snowfall.

```vb
pta.Color = Colors.Black
```

### EnableAlphaFade
Enable alpha fading for a smoother visual effect.

```vb
pta.EnableAlphaFade = True
```

### EnableRandomCurving
Enable random curving of snowflakes.

```vb
pta.EnableRandomCurving  = True
```

### AnimateDuration 
Set the duration of the snowfall animation.

```vb
pta.AnimateDuration  = 10000
```
### GenerateSnowTiming
Set the timing for generating new snowflakes.

```vb
pta.GenerateSnowTiming = 45
```

### ImageBitmap
Set the bitmap for the snowflake image.

```vb
pta.ImageBitmap = LoadBitmap(File.DirAssets, "snow.png")
```

### setRandomSnowSizeRange(minSize, maxSize)
Set the range of random snowflake sizes.

```vb
pta.setRandomSnowSizeRange(25, 1)
```

### setCurvingRandom(minAngle, maxAngle)
Set the range of random curving angles.

```vb
pta.setCurvingRandom(180, 90)
```


## Example

Include a brief code snippet or example to showcase the library's usage.

## License

This project is licensed under the [MIT License](LICENSE).
