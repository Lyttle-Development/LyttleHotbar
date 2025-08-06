<div align="center">
  
# LyttleHotbar

[![Paper](https://img.shields.io/badge/Paper-1.21.x-blue)](https://papermc.io)
[![Hangar](https://img.shields.io/badge/Hangar-download-success)](https://hangar.papermc.io/Lyttle-Development)
[![Discord](https://img.shields.io/discord/941334383216967690?color=7289DA&label=Discord&logo=discord&logoColor=ffffff)](https://discord.gg/QfqFFPFFQZ)

<img src="https://raw.githubusercontent.com/Lyttle-Development/LyttleUtils/main/navigation_showcase.gif" alt="Plugin Banner" width="700px">

> ✨ **The ultimate lightweight navigation bar and actionbar overlay plugin for modern Minecraft servers.** ✨

[📚 Features](#--features) • [⌨️ Commands](#-%EF%B8%8F-commands) • [🔑 Permissions](#--permissions) • [📥 Installation](#--installation) • [⚙️ Configuration](#%EF%B8%8F-configuration) • [📱 Support](#--support)

</div>

![Divider](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)

## 🌟 Features

<p align="center">
  <img src="https://raw.githubusercontent.com/Lyttle-Development/LyttleUtils/main/navigation_showcase.gif" alt="Feature Showcase" width="500px">
</p>

### 🎯 Core Plugin Features

- Real-time overlay using MiniMessage formatting
- Player direction (`<PLAYER_FACING>`), in-game 24h time (`<SERVER_TIME_24_H>`), and total server days (`<STATISTIC_TOTAL_SERVER_DAYS>`)
- Supports PlaceholderAPI for coordinates and more: `%player_x%`, `%player_y%`, `%player_z%`, etc.
- ActionBar display updates on inventory, join, teleport, or world change
- Fully configurable, lightweight, and open source

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
| `lyttlehotbar.*`      | Grants all plugin permissions    | ❌      |
| `lyttlehotbar.reload` | Allows reloading config/messages | ❌      |

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

The main configuration file controlling plugin behavior and features.  
Supports placeholders like `<PLAYER_FACING>`, `<SERVER_TIME_24_H>`, `<STATISTIC_TOTAL_SERVER_DAYS>`, and PlaceholderAPI values such as `%player_x%`, `%player_y%`, `%player_z%`.

#### 💬 `messages.yml`

Customize all plugin messages. Supports MiniMessage formatting.

### 🔄 The #defaults Folder

The folder serves several important purposes: `#defaults`

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
