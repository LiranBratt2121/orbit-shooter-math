# FRC Rapid React: Adjustable Hood - Theoretical Calculations for 100% Toss Rate

![image](https://github.com/LiranBratt2121/orbit-shooter-math/assets/95234790/1fbd3fa6-065a-44d2-aad0-038789fa7a71)


## Description

This repository contains the theoretical calculations for achieving a 100% toss rate in the FRC Rapid React game. The calculations are specifically focused on the adjustment of the hood angle to optimize the shooting performance.

## Variables

- **dx**: Distance from the basket.
- **dy**: Constant height difference between the shooter and the basket.
- **V**: Constant linear velocity at which the ball is shot.
- **k**: Constant used in the calculation, determined as (4.9 * dx²) / V².

## Calculation Formula

![image](https://github.com/LiranBratt2121/orbit-shooter-math/assets/95234790/ad0fafe7-8bbc-4b71-9222-006d1618455e)

## Assumptions

For the purpose of simplicity, this calculation does not consider the drag force and the Magnus effect.

## Usage

To achieve a successful formula with only one variable, **α** (the angle that the hood should be set to), follow the provided calculation formula. Adjust the hood angle accordingly to optimize the toss rate.
