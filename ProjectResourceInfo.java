public class ProjectResourceInfo {

    private String projectId;
    private String parentId;
    private int ckioskMode;
    private DeviceManagementDTO deviceManagementDTO;
    private List<DeviceAppPkgNameDTO> deviceAppPkgNameDtos;
    private int version;
    private AdvancedSystemSettingDTO advancedSystemSettingDTO;
    private CommunicationSettingDTO communicationSettingDTO;
    private SystemSettingExtendDTO systemSettingExtendDTO;
    private SystemSettingDTO systemSettingDTO;
    private BootAndShutdownDTO bootAndShutdownDTO;
    private HomeAndThemeDTO homeAndThemeDTO;
    private LauncherLayoutDto launcherLayoutDto;
    private List<APNSettingDTO> aPNSettingDtos;
    private APNXmlDto aPNXmlDto;
    private WifiAccessPointSettingDTO wifiSettingDto;
    private RawDataDto rawDataDto;
    private List<PersistValue> persistValues;
    private List<SettingsValue> settingsValues;
    private DeviceOwnerSettingDto deviceOwnerSettingDto;
    private NotificationAccessDTO notificationAccessDTO;
    private List<AppsManagementDto> preloadApps;
    private List<String> removeApps;
    private List<RemovePreloadAppsDto> unRemoveApps;
    private List<OperPermissionForSpecificAppsDto> operPermissionForSpecificApps;
    private List<RuntimePermissionForSpecificAppsDto> runtimePermissionForSpecificApps;
    private List<BatteryOptimisationWhiteListDto> batteryOptWhiteApps;
    private AppSettingDto appSettingDto;
    private List<CKioskAppsDto> ckioskApps;
    private List<CKioskWebLinkDto> cKioskWebLinks;
    private CKioskSettingDto ckioskSetting;
    private List<CKioskAuthSettingDto> ckioskAuthSetting;
    private PreWifiNetworkDto preWifiNetworkDto;
    private DynamicPartitionDto dynamicPartitionDto;

    public String getProjectId() {
        return projectId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public int getCkioskMode() {
        return ckioskMode;
    }

    public void setCkioskMode(int ckioskMode) {
        this.ckioskMode = ckioskMode;
    }

    public DeviceManagementDTO getDeviceManagementDTO() {
        return deviceManagementDTO;
    }

    public void setDeviceManagementDTO(DeviceManagementDTO deviceManagementDTO) {
        this.deviceManagementDTO = deviceManagementDTO;
    }

    public List<DeviceAppPkgNameDTO> getDeviceAppPkgNameDtos() {
        return deviceAppPkgNameDtos;
    }

    public void setDeviceAppPkgNameDtos(List<DeviceAppPkgNameDTO> deviceAppPkgNameDtos) {
        this.deviceAppPkgNameDtos = deviceAppPkgNameDtos;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public AdvancedSystemSettingDTO getAdvancedSystemSettingDTO() {
        return advancedSystemSettingDTO;
    }

    public void setAdvancedSystemSettingDTO(AdvancedSystemSettingDTO advancedSystemSettingDTO) {
        this.advancedSystemSettingDTO = advancedSystemSettingDTO;
    }

    public CommunicationSettingDTO getCommunicationSettingDTO() {
        return communicationSettingDTO;
    }

    public void setCommunicationSettingDTO(CommunicationSettingDTO communicationSettingDTO) {
        this.communicationSettingDTO = communicationSettingDTO;
    }

    public SystemSettingExtendDTO getSystemSettingExtendDTO() {
        return systemSettingExtendDTO;
    }

    public void setSystemSettingExtendDTO(SystemSettingExtendDTO systemSettingExtendDTO) {
        this.systemSettingExtendDTO = systemSettingExtendDTO;
    }

    public SystemSettingDTO getSystemSettingDTO() {
        return systemSettingDTO;
    }

    public void setSystemSettingDTO(SystemSettingDTO systemSettingDTO) {
        this.systemSettingDTO = systemSettingDTO;
    }

    public BootAndShutdownDTO getBootAndShutdownDTO() {
        return bootAndShutdownDTO;
    }

    public void setBootAndShutdownDTO(BootAndShutdownDTO bootAndShutdownDTO) {
        this.bootAndShutdownDTO = bootAndShutdownDTO;
    }

    public HomeAndThemeDTO getHomeAndThemeDTO() {
        return homeAndThemeDTO;
    }

    public void setHomeAndThemeDTO(HomeAndThemeDTO homeAndThemeDTO) {
        this.homeAndThemeDTO = homeAndThemeDTO;
    }

    public LauncherLayoutDto getLauncherLayoutDto() {
        return launcherLayoutDto;
    }

    public void setLauncherLayoutDto(LauncherLayoutDto launcherLayoutDto) {
        this.launcherLayoutDto = launcherLayoutDto;
    }

    public List<APNSettingDTO> getaPNSettingDtos() {
        return aPNSettingDtos;
    }

    public void setaPNSettingDtos(List<APNSettingDTO> aPNSettingDtos) {
        this.aPNSettingDtos = aPNSettingDtos;
    }

    public APNXmlDto getaPNXmlDto() {
        return aPNXmlDto;
    }

    public void setaPNXmlDto(APNXmlDto aPNXmlDto) {
        this.aPNXmlDto = aPNXmlDto;
    }

    public WifiAccessPointSettingDTO getWifiSettingDto() {
        return wifiSettingDto;
    }

    public void setWifiSettingDto(WifiAccessPointSettingDTO wifiSettingDto) {
        this.wifiSettingDto = wifiSettingDto;
    }

    public RawDataDto getRawDataDto() {
        return rawDataDto;
    }

    public void setRawDataDto(RawDataDto rawDataDto) {
        this.rawDataDto = rawDataDto;
    }

    public List<PersistValue> getPersistValues() {
        return persistValues;
    }

    public void setPersistValues(List<PersistValue> persistValues) {
        this.persistValues = persistValues;
    }

    public List<SettingsValue> getSettingsValues() {
        return settingsValues;
    }

    public void setSettingsValues(List<SettingsValue> settingsValues) {
        this.settingsValues = settingsValues;
    }

    public DeviceOwnerSettingDto getDeviceOwnerSettingDto() {
        return deviceOwnerSettingDto;
    }

    public void setDeviceOwnerSettingDto(DeviceOwnerSettingDto deviceOwnerSettingDto) {
        this.deviceOwnerSettingDto = deviceOwnerSettingDto;
    }

    public NotificationAccessDTO getNotificationAccessDTO() {
        return notificationAccessDTO;
    }

    public void setNotificationAccessDTO(NotificationAccessDTO notificationAccessDTO) {
        this.notificationAccessDTO = notificationAccessDTO;
    }

    public List<AppsManagementDto> getPreloadApps() {
        return preloadApps;
    }

    public void setPreloadApps(List<AppsManagementDto> preloadApps) {
        this.preloadApps = preloadApps;
    }

    public List<String> getRemoveApps() {
        return removeApps;
    }

    public void setRemoveApps(List<String> removeApps) {
        this.removeApps = removeApps;
    }

    public List<RemovePreloadAppsDto> getUnRemoveApps() {
        return unRemoveApps;
    }

    public void setUnRemoveApps(List<RemovePreloadAppsDto> unRemoveApps) {
        this.unRemoveApps = unRemoveApps;
    }

    public List<OperPermissionForSpecificAppsDto> getOperPermissionForSpecificApps() {
        return operPermissionForSpecificApps;
    }

    public void setOperPermissionForSpecificApps(List<OperPermissionForSpecificAppsDto> operPermissionForSpecificApps) {
        this.operPermissionForSpecificApps = operPermissionForSpecificApps;
    }

    public List<RuntimePermissionForSpecificAppsDto> getRuntimePermissionForSpecificApps() {
        return runtimePermissionForSpecificApps;
    }

    public void setRuntimePermissionForSpecificApps(List<RuntimePermissionForSpecificAppsDto> runtimePermissionForSpecificApps) {
        this.runtimePermissionForSpecificApps = runtimePermissionForSpecificApps;
    }

    public List<BatteryOptimisationWhiteListDto> getBatteryOptWhiteApps() {
        return batteryOptWhiteApps;
    }

    public void setBatteryOptWhiteApps(List<BatteryOptimisationWhiteListDto> batteryOptWhiteApps) {
        this.batteryOptWhiteApps = batteryOptWhiteApps;
    }

    public AppSettingDto getAppSettingDto() {
        return appSettingDto;
    }

    public void setAppSettingDto(AppSettingDto appSettingDto) {
        this.appSettingDto = appSettingDto;
    }

    public List<CKioskAppsDto> getCkioskApps() {
        return ckioskApps;
    }

    public void setCkioskApps(List<CKioskAppsDto> ckioskApps) {
        this.ckioskApps = ckioskApps;
    }

    public List<CKioskWebLinkDto> getCKioskWebLinks() {
        return cKioskWebLinks;
    }

    public void setCKioskWebLinks(List<CKioskWebLinkDto> cKioskWebLinks) {
        this.cKioskWebLinks = cKioskWebLinks;
    }

    public CKioskSettingDto getCkioskSetting() {
        return ckioskSetting;
    }

    public void setCkioskSetting(CKioskSettingDto ckioskSetting) {
        this.ckioskSetting = ckioskSetting;
    }

    public List<CKioskAuthSettingDto> getCkioskAuthSetting() {
        return ckioskAuthSetting;
    }

    public void setCkioskAuthSetting(List<CKioskAuthSettingDto> ckioskAuthSetting) {
        this.ckioskAuthSetting = ckioskAuthSetting;
    }

    public PreWifiNetworkDto getPreWifiNetworkDto() {
        return preWifiNetworkDto;
    }

    public void setPreWifiNetworkDto(PreWifiNetworkDto preWifiNetworkDto) {
        this.preWifiNetworkDto = preWifiNetworkDto;
    }

    public DynamicPartitionDto getDynamicPartitionDto() {
        return dynamicPartitionDto;
    }

    public void setDynamicPartitionDto(DynamicPartitionDto dynamicPartitionDto) {
        this.dynamicPartitionDto = dynamicPartitionDto;
    }
}
