import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.api.methods.groupadministration.KickChatMember;
import org.telegram.telegrambots.meta.api.methods.groupadministration.LeaveChat;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.games.Animation;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.api.objects.stickers.Sticker;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

/**
 * @author Gaiduchek Maxim
 * @version 1.0
 * API version must be 4.0+
 */

public class SimpleSender extends DefaultAbsSender {

    private final String TOKEN;

    public SimpleSender(String token) {
        this(token, ApiContext.getInstance(DefaultBotOptions.class));
    }

    public SimpleSender(String token, DefaultBotOptions options) {
        super(options);
        TOKEN = token;
    }

    // string

    public synchronized void sendString(String chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendString(Long chatId, String text) {
        sendString(chatId.toString(), text);
    }

    public synchronized void sendString(String chatId, String text, Integer replyToMessageId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setReplyToMessageId(replyToMessageId);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendString(Long chatId, String text, Integer replyToMessageId) {
        sendString(chatId.toString(), text, replyToMessageId);
    }

    public synchronized void sendString(String chatId, String text, boolean enableMarkdown) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(enableMarkdown);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendString(Long chatId, String text, boolean enableMarkdown) {
        sendString(chatId.toString(), text, enableMarkdown);
    }

    public synchronized void sendString(String chatId, String text, Integer replyToMessageId, boolean enableMarkdown) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(enableMarkdown);
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setReplyToMessageId(replyToMessageId);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendString(Long chatId, String text, Integer replyToMessageId, boolean enableMarkdown) {
        sendString(chatId.toString(), text, replyToMessageId, enableMarkdown);
    }

    // photo

    public synchronized void sendPhoto(String chatId, List<PhotoSize> photo) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(photo.get(0).getFileId());
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendPhoto(Long chatId, List<PhotoSize> photo) {
        sendPhoto(chatId.toString(), photo);
    }

    public synchronized void sendPhoto(String chatId, List<PhotoSize> photo, String caption) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setCaption(caption);
        sendPhoto.setPhoto(photo.get(0).getFileId());
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendPhoto(Long chatId, List<PhotoSize> photo, String caption) {
        sendPhoto(chatId.toString(), photo, caption);
    }

    public synchronized void sendPhoto(String chatId, String photoId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(photoId);
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendPhoto(Long chatId, String photoId) {
        sendPhoto(chatId.toString(), photoId);
    }

    public synchronized void sendPhoto(String chatId, String photoId, String caption) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(photoId);
        sendPhoto.setCaption(caption);
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendPhoto(Long chatId, String photoId, String caption) {
        sendPhoto(chatId.toString(), photoId, caption);
    }

    // video

    public synchronized void sendVideo(String chatId, Video video) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(video.getFileId());
        try {
            execute(sendVideo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendVideo(Long chatId, Video video) {
        sendVideo(chatId.toString(), video);
    }

    public synchronized void sendVideo(String chatId, Video video, String caption) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setCaption(caption);
        sendVideo.setVideo(video.getFileId());
        try {
            execute(sendVideo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendVideo(Long chatId, Video video, String caption) {
        sendVideo(chatId.toString(), video, caption);
    }

    // video note

    public synchronized void sendVideoNote(String chatId, VideoNote videoNote) {
        SendVideoNote sendVideoNote = new SendVideoNote();
        sendVideoNote.setChatId(chatId);
        sendVideoNote.setVideoNote(videoNote.getFileId());
        try {
            execute(sendVideoNote);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendVideoNote(Long chatId, VideoNote videoNote) {
        sendVideoNote(chatId.toString(), videoNote);
    }

    // voice

    public synchronized void sendVoice(String chatId, Voice voice) {
        SendVoice sendVoice = new SendVoice();
        sendVoice.setChatId(chatId);
        sendVoice.setVoice(voice.getFileId());
        try {
            execute(sendVoice);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendVoice(Long chatId, Voice voice) {
        sendVoice(chatId.toString(), voice);
    }

    // audio

    public synchronized void sendAudio(String chatId, Audio audio) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setChatId(chatId);
        sendAudio.setAudio(audio.getFileId());
        try {
            execute(sendAudio);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendAudio(Long chatId, Audio audio) {
        sendAudio(chatId.toString(), audio);
    }

    // sticker

    public synchronized void sendSticker(String chatId, Sticker sticker) {
        SendSticker sendSticker = new SendSticker();
        sendSticker.setChatId(chatId);
        sendSticker.setSticker(sticker.getFileId());
        try {
            execute(sendSticker);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendSticker(Long chatId, Sticker sticker) {
        sendSticker(chatId.toString(), sticker);
    }

    // contact

    public synchronized void sendContact(String chatId, Contact contact) {
        SendContact sendContact = new SendContact();
        sendContact.setChatId(chatId);
        sendContact.setPhoneNumber(contact.getPhoneNumber());
        sendContact.setFirstName(contact.getFirstName());
        sendContact.setLastName(contact.getLastName());
        try {
            execute(sendContact);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendContact(Long chatId, Contact contact) {
        sendContact(chatId.toString(), contact);
    }

    // location

    public synchronized void sendLocation(String chatId, Location location) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLongitude(location.getLongitude());
        sendLocation.setLatitude(location.getLatitude());
        try {
            execute(sendLocation);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendLocation(Long chatId, Location location) {
        sendLocation(chatId.toString(), location);
    }

    // document

    public synchronized void sendDocument(String chatId, Document document) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(document.getFileId());
        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendDocument(Long chatId, Document document) {
        sendDocument(chatId.toString(), document);
    }

    public synchronized void sendDocument(String chatId, String fileId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(fileId);
        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendDocument(Long chatId, String fileId) {
        sendDocument(chatId.toString(), fileId);
    }

    public synchronized void sendDocument(String chatId, Document document, String caption) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(document.getFileId());
        sendDocument.setCaption(caption);
        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendDocument(Long chatId, Document document, String caption) {
        sendDocument(chatId.toString(), document, caption);
    }

    public synchronized void sendDocument(String chatId, String fileId, String caption) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(fileId);
        sendDocument.setCaption(caption);
        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendDocument(Long chatId, String fileId, String caption) {
        sendDocument(chatId.toString(), fileId, caption);
    }

    // animation

    public synchronized void sendAnimation(String chatId, Animation animation) {
        SendAnimation sendAnimation = new SendAnimation();
        sendAnimation.setChatId(chatId);
        sendAnimation.setAnimation(animation.getFileId());
        try {
            execute(sendAnimation);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendAnimation(Long chatId, Animation animation) {
        sendAnimation(chatId.toString(), animation);
    }

    public synchronized void sendAnimation(String chatId, Animation animation, String caption) {
        SendAnimation sendAnimation = new SendAnimation();
        sendAnimation.setChatId(chatId);
        sendAnimation.setCaption(caption);
        sendAnimation.setAnimation(animation.getFileId());
        try {
            execute(sendAnimation);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendAnimation(Long chatId, Animation animation, String caption) {
        sendAnimation(chatId.toString(), animation, caption);
    }

    // string and keyboard

    public synchronized void sendStringAndKeyboard(String chatId, String text, List<KeyboardRow> keyboard) {
        SendMessage sendMessage = new SendMessage();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setChatId(chatId);
        sendMessage.enableMarkdown(true);
        sendMessage.setText(text);

        replyKeyboardMarkup.setSelective(false);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        replyKeyboardMarkup.setKeyboard(keyboard);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendStringAndKeyboard(Long chatId, String text, List<KeyboardRow> keyboard) {
        sendStringAndKeyboard(chatId.toString(), text, keyboard);
    }

    public synchronized void sendStringAndKeyboard(String chatId, String text, List<KeyboardRow> keyboard, boolean oneTimeKeyboard) {
        SendMessage sendMessage = new SendMessage();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        replyKeyboardMarkup.setSelective(false);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(oneTimeKeyboard);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setChatId(chatId);
        sendMessage.enableMarkdown(true);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendStringAndKeyboard(Long chatId, String text, List<KeyboardRow> keyboard, boolean oneTimeKeyboard) {
        sendStringAndKeyboard(chatId.toString(), text, keyboard, oneTimeKeyboard);
    }

    // string and inline keyboard

    public synchronized void sendStringAndInlineKeyboard(String chatId, String text, List<List<InlineKeyboardButton>> keyboard) {
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        inlineKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        sendMessage.setChatId(chatId);
        sendMessage.enableMarkdown(true);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendStringAndInlineKeyboard(Long chatId, String text, List<List<InlineKeyboardButton>> keyboard) {
        sendStringAndInlineKeyboard(chatId.toString(), text, keyboard);
    }

    // editing

    // string
    public synchronized void editMessageText(String chatId, Integer messageId, String text) {
        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);
        editMessageText.setText(text);
        editMessageText.enableMarkdown(true);
        try {
            execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void editMessageText(Long chatId, Integer messageId, String text) {
        editMessageText(chatId.toString(), messageId, text);
    }

    public synchronized void editMessageText(String chatId, Integer messageId, String text, boolean enableMarkdown) {
        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);
        editMessageText.setText(text);
        editMessageText.enableMarkdown(enableMarkdown);
        try {
            execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void editMessageText(Long chatId, Integer messageId, String text, boolean enableMarkdown) {
        editMessageText(chatId.toString(), messageId, text, enableMarkdown);
    }

    // inline keyboard
    public synchronized void editMessageInlineKeyboard(String chatId, Integer messageId, List<List<InlineKeyboardButton>> keyboard) {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setReplyMarkup(new InlineKeyboardMarkup().setKeyboard(keyboard));
        editMessageReplyMarkup.setChatId(chatId);
        editMessageReplyMarkup.setMessageId(messageId);
        try {
            execute(editMessageReplyMarkup);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void editMessageInlineKeyboard(Long chatId, Integer messageId, List<List<InlineKeyboardButton>> keyboard) {
        editMessageInlineKeyboard(chatId.toString(), messageId, keyboard);
    }

    // string and inline keyboard
    public synchronized void editMessageTextAndInlineKeyboard(String chatId, Integer messageId, String text, List<List<InlineKeyboardButton>> keyboard) {
        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);
        editMessageText.setText(text);
        editMessageText.enableMarkdown(true);
        editMessageText.setReplyMarkup(new InlineKeyboardMarkup().setKeyboard(keyboard));
        try {
            execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void editMessageTextAndInlineKeyboard(Long chatId, Integer messageId, String text, List<List<InlineKeyboardButton>> keyboard) {
        editMessageTextAndInlineKeyboard(chatId.toString(), messageId, text, keyboard);
    }

    public synchronized void editMessageTextAndInlineKeyboard(String chatId, Integer messageId, String text, List<List<InlineKeyboardButton>> keyboard, boolean enableMarkdown) {
        EditMessageText editMessageText = new EditMessageText();
        editMessageText.setChatId(chatId);
        editMessageText.setMessageId(messageId);
        editMessageText.setText(text);
        editMessageText.enableMarkdown(enableMarkdown);
        editMessageText.setReplyMarkup(new InlineKeyboardMarkup().setKeyboard(keyboard));
        try {
            execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void editMessageTextAndInlineKeyboard(Long chatId, Integer messageId, String text, List<List<InlineKeyboardButton>> keyboard, boolean enableMarkdown) {
        editMessageTextAndInlineKeyboard(chatId.toString(), messageId, text, keyboard, enableMarkdown);
    }

    // deleting

    public synchronized void deleteMessage(String chatId, Integer messageId) {
        DeleteMessage deleteMessage = new DeleteMessage();
        deleteMessage.setChatId(chatId);
        deleteMessage.setMessageId(messageId);
        try {
            execute(deleteMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deleteMessage(Long chatId, Integer messageId) {
        deleteMessage(chatId.toString(), messageId);
    }

    // kicking chat member

    public synchronized void kickChatMember(Integer userId, String chatId) {
        KickChatMember kickChatMember = new KickChatMember();
        kickChatMember.setUserId(userId);
        kickChatMember.setChatId(chatId);
        try {
            execute(kickChatMember);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void kickChatMember(Integer userId, Long chatId) {
        kickChatMember(userId, chatId.toString());
    }

    // leaving chat

    public synchronized void leaveChat(String chatId) {
        LeaveChat leaveChat = new LeaveChat();
        leaveChat.setChatId(chatId);
        try {
            execute(leaveChat);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public synchronized void leaveChat(Long chatId) {
        leaveChat(chatId.toString());
    }

    // token

    public String getBotToken() {
        return TOKEN;
    }
}

