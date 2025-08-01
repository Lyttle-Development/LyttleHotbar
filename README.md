<div align="center">

# Lyttle Hotbar

[![Paper](https://img.shields.io/badge/Paper-1.21.x-blue)](https://papermc.io)
[![Hangar](https://img.shields.io/badge/Hangar-download-success)](https://hangar.papermc.io/Lyttle-Development)
[![Discord](https://img.shields.io/discord/941334383216967690?color=7289DA&label=Discord&logo=discord&logoColor=ffffff)](https://discord.gg/QfqFFPFFQZ)

<img src="https://raw.githubusercontent.com/Lyttle-Development/LyttleUtils/main/banner_navigation.png" alt="Navigation Banner" width="700px">

> 🧭 **Minimal, real-time Minecraft navigation overlay with direction, time, and server day tracking** 🧭

[📚 Features](#-features) • [⌨️ Commands](#-commands) • [🔑 Permissions](#-permissions) • [📥 Installation](#-installation) • [⚙️ Configuration](#-configuration) • [💬 Support](#-support)

</div>

![Divider](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## 🌟 Features

<p align="center">
  <img src="https://raw.githubusercontent.com/Lyttle-Development/LyttleUtils/main/navigation_showcase.gif" alt="Feature Showcase" width="500px">
</p>

### 🎯 Core Plugin Features

- Real-time overlay with MiniMessage formatting
- Player direction (<PLAYER_FACING>), in-game 24h time (<SERVER_TIME_24_H>), and server days (<STATISTIC_TOTAL_SERVER_DAYS>)
- Supports PlaceholderAPI for coordinates and more (`%player_x%`, `%player_y%`, `%player_z%`)
- ActionBar display updates on inventory, join, teleport, or world change
- Fully configurable, lightweight, open source

---

### 🤌 Lyttle Certified

- Basic plugin without fluff
- No unnecessary features
- Full flexibility and configurability
- Open source and free to use (MIT License)

---

## ⌨️ Commands

> 💡 `<required>` `[optional]`

| Command                | Permission            | Description                  |
|:-----------------------|:----------------------|:-----------------------------|
| `/lyttlehotbar reload` | `lyttlehotbar.reload` | Reloads plugin configuration |

---

## 🔑 Permissions

| Permission Node       | Description                      | Default |
|:----------------------|:---------------------------------|:--------|
| `lyttlehotbar.*`      | Grants all plugin permissions    | ❌       |
| `lyttlehotbar.reload` | Allows reloading config/messages | ❌       |

---

## 📥 Installation

### Quick Start

1. Download the latest version from [Hangar](https://hangar.papermc.io/Lyttle-Development)
2. Place the `.jar` file in your server's `plugins` folder
3. Download and add [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) for coordinate placeholders (`%player_x%`, etc.)
4. Restart your server
5. Edit the configuration file to customize navigation overlays

---

### 📋 Requirements

- Java 21 or newer
- Paper 1.21.x+
- [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) for player coordinates
- Minimum 10MB free disk space

---

### 💫 Dependencies

- [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) - Required for player coordinate placeholders

---

### 📝 Configuration Files

#### 🔧 `config.yml`

Main configuration for navigation overlays and formatting.

```yaml
COMPASS: "<white>X:<yellow>%player_x% <white>Y:<yellow>%player_y% <white>Z:<yellow>%player_z% <gray>| <white><PLAYER_FACING>"
CLOCK: "<white><SERVER_TIME_24_H> <gray>| <yellow><STATISTIC_TOTAL_SERVER_DAYS> days"
update_rate: 0.5 # in seconds
config_version: 0
```

- You can freely add more entries using any [Material name from available_materials.txt](available_materials.txt) (e.g., `MAP: ...`, `PAPER: ...`) to display custom navigation overlays for those items.
- Placeholders:
    - `<PLAYER_FACING>`: Player's direction (e.g., South-East)
    - `<SERVER_TIME_24_H>`: In-game world time (24h)
    - `<STATISTIC_TOTAL_SERVER_DAYS>`: Days since world creation
    - `%player_x%`, `%player_y%`, `%player_z%`, ...: Provided by PlaceholderAPI

#### 💬 `messages.yml`

Customize all plugin messages. Supports MiniMessage formatting.

### 🔄 The #defaults Folder

The folder serves several important purposes:

1. **Backup Reference**: Contains original copies of all configuration files
2. **Reset Option**: Use these to restore default settings
3. **Update Safety**: Preserved during plugin updates
4. **Documentation**: Shows all available options with comments

> 💡 **Never modify files in the #defaults folder!** They are automatically overwritten during server restarts.

---

## 💬 Support

<div align="center">

### 🤝 Need Help?

[![Discord](https://img.shields.io/discord/941334383216967690?color=7289DA&label=Join%20Our%20Discord&logo=discord&logoColor=ffffff&style=for-the-badge)](https://discord.gg/QfqFFPFFQZ)

🐛 Found a bug? [Open an Issue](https://github.com/Lyttle-Development/LyttleHotbar/issues)  
💡 Have a suggestion? [Share your idea](https://github.com/Lyttle-Development/LyttleHotbar/issues)

</div>

---

## 📜 License

<div align="center">

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### 🌟 Made with the lyttlest details in mind by [Lyttle Development](https://www.lyttledevelopment.com)

If you enjoy this plugin, please consider:

⭐ Giving it a star on GitHub <br>
💬 Sharing it with other server owners<br>
🎁 Supporting development through [Donations](https://github.com/LyttleDevelopment)

![Divider](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

</div>