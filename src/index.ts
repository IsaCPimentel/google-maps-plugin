import { registerPlugin } from '@capacitor/core';

import type { EchoPluginPlugin } from './definitions';

const EchoPlugin = registerPlugin<EchoPluginPlugin>('Echo', {
  web: () => import('./web').then((m) => new m.EchoPluginWeb()),
});

export * from './definitions';
export { EchoPlugin };
