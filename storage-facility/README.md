# Storage Facility

Small practice task from Java Programming MOOC (Part 8) — practice using a `HashMap` to store lists of items per storage unit.

## Challenge

**From:** Java Programming MOOC Part 8

**Task:** Implement a `StorageFacility` that maps storage unit names to lists of items and supports `add`, `contents`, `remove`, and `storageUnits` operations.

## Class Structure

| Class             | Responsibility                            |
| :---------------- | :---------------------------------------- |
| `StorageFacility` | Stores items per unit (add/remove/lookup) |
| `Program`         | Demo runner showing example usage         |

## Features

- Add items to a unit (creates unit if needed)
- List contents of a unit
- Remove one occurrence of an item; remove unit when empty
- List active storage unit names

## Example output

```
[ice skates, ice hockey stick, ice skates]
[rollerblades]
[a14, g63]
```
